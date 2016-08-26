package example.jobs;

import com.cloudera.livy.Job;
import com.cloudera.livy.JobContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.mllib.stat.KernelDensity;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;

/**
 * Created by manikandan.nagarajan on 7/12/16.
 */
public class HiveJob implements Job<double[]> {

    private String column;

    public HiveJob(String column) {
        this.column = column;
    }

    @Override
    public double[] call(JobContext jobContext) throws Exception {
        DataFrame dataFrame = jobContext.sqlctx().read().json("/Users/manikandan.nagarajan/input.json");
        JavaRDD<Double> javaRDD = dataFrame.javaRDD().map(new Function<Row, Double>() {

            @Override
            public Double call(Row row) throws Exception {
                return row.getDouble(row.fieldIndex(column));
            }
        });
        KernelDensity kernelDensity = new KernelDensity().setSample(javaRDD).setBandwidth(3.0);
        return kernelDensity.estimate(new double[]{-1.0, 2.0, 5.0});
    }
}

package example.service;

import com.cloudera.livy.JobHandle;
import com.cloudera.livy.LivyClient;
import com.cloudera.livy.LivyClientBuilder;
import example.jobs.HiveJob;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

/**
 * Created by manikandan.nagarajan on 7/12/16.
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public void process(String column) {
        try {
            LivyClient client = new LivyClientBuilder(true).setURI(new URI("http://192.168.0.100:8998")).build();
            Thread.sleep(20000);
            Object str = client.uploadJar(new File("/Users/manikandan.nagarajan/jars/demo1-1.3.6.RELEASE.jar")).get();
            System.out.println("object::" + str);
            JobHandle<double[]> handle = client.submit(new HiveJob(column));
            double[] result = handle.get();
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

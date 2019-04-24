package mtd.sidecar.sidecar_client;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringCloudApplication
@EnableSidecar
//@EnableDiscoveryClient
public class SidecarClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidecarClientApplication.class, args);
    }

}

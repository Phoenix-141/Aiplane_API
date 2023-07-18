package com.flyapi.flyauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class FlyautoApplication {

  public static void main(String[] args) {
      SpringApplication.run(FlyautoApplication.class, args);
  }


}

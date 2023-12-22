import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@SpringBootApplication
@RestController
public class SumAPI {

    public static void main(String[] args) {
        SpringApplication.run(SumAPI.class, args);
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("a") String a, @RequestParam("b") String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);
        return sum.toString();
    }
}

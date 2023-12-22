import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@SpringBootApplication
@RestController
public class SumAPI {

    public static void main(String[] args) {
        SpringApplication.run(SumAPI.class, args);
    }

    @GetMapping("/sum/{num1}/{num2}")
    public String sum(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger sum = number1.add(number2);
        return sum.toString();
    }
}

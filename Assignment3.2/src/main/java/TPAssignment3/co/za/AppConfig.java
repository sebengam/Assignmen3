package TPAssignment3.co.za;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by thabomoopa on 2017/03/24.
 */
@Configuration
public class AppConfig {
    @Bean(name="ATM")
    public AtmMachineInterface getService(){
        return new AtmMachineImpl();
    }
}

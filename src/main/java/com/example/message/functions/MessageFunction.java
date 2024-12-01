package com.example.message.functions;

import com.example.message.dto.AccountMsgDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.logging.Logger;

@Configuration
public class MessageFunction {

     Logger log = Logger.getLogger(MessageFunction.class.getName());
    @Bean
    public Function<AccountMsgDto,AccountMsgDto> email(){
        return accountMsgDto -> {
            log.info("Sending email with deatils: "+ accountMsgDto.toString());
            return accountMsgDto;
        };
    }

    @Bean
    public Function<AccountMsgDto,Long> sms(){
        return accountMsgDto -> {
            log.info("Sending sms with  deatils: "+ accountMsgDto.toString());
            return accountMsgDto.id();
        };
    }
}

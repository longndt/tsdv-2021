package spring.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import spring.pojo.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) throws JsonProcessingException {
        //Add dữ liệu cho POJO
        Company c1 = new Company("Toshiba","Kim Ma", "0912345678");
        Company c2 = new Company("FPT", "Pham Hung", "0988888888");
        List<Company> companies = new ArrayList<>();
        companies.add(c1);
        companies.add(c2);
        //Chuyển POJO thành JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(companies);
        System.out.println(json);
    }
}

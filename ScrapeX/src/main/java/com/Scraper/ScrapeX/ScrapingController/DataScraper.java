@RestController
public class DataScraper {

    @Autowired
    ScrapeService service;
  
 @PostMapping("/url") 
public void readIN(@RequestBody String URL,String user,String password)

 boolean login;
 service.Scraper(URL);
 System.out.println("login Successful");
 


 if(login){
    
        
 }
 else{
     
 }

}
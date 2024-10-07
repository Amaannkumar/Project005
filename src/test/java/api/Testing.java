package api;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Testing {
	
	@Test
	void getuser()
	{
		given()
		
		.headers("Authorization","Bearer 88cee8db8241fd979daff1ba6580bc794fd452d23fe52af04b932622a9dbdae2")
		
		.when()
		.get("https://gorest.co.in/public/v2/users/7441635")
		
		.then()
		.statusCode(200)
	    .body("gender",equalTo("male"))
		.log().all();
	}
   /*
	@Test
   void createuser() {
	   HashMap hm=new HashMap();
	   hm.put("name","Bhoopati Kau");
	   hm.put("email","amankumarrr7992@gmail.com");
	   hm.put("gender","male");
	   hm.put("status","active");
	   
	   given()
	   .body(hm)
	   .header("Authorization","Bearer 88cee8db8241fd979daff1ba6580bc794fd452d23fe52af04b932622a9dbdae2")
	   .contentType("application/json")
	   
	   .when()
	   .post("https://gorest.co.in/public/v2/users")
	   .then()
	   .statuscode(200)
	   .log().all();
	   */
   }

package application.main.stepDefImpl;

public class Main {

   public static void main(String[] args) {
	   LoginPage login= new LoginPage();
	   CreateEmployee employee= new CreateEmployee();
		login.loginValidation("mvenkat@dhs.gov","inaflash");
		login.loginValidation("","inaflash");
		login.loginValidation("mvenkat@dhs.gov","");
		login.loginValidation("123","inaflash");
		login.loginValidation("****", "((((((");
		
		login.loginUI("amurphy@dhs.gov","inaflash");
		employee.createEmployee("demo2", "demo2", "demouser6@dhs.gov", "inaflash", "IT");
		login.loginValidation("demouser6@dhs.gov", "inaflash");
		login.loginUI("amurphy@dhs.gov","inaflash");
		employee.createEmployee("demo2", "demo2", "demouser6@dhs.gov", "inaflash", "IT");
	
		GiveKudos kudos= new GiveKudos();
		login.loginUI("demouser6@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee("1", "Teamwork","Good Work");
		login.loginUI("demouser6@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee("1", "Teamwork","Good Work");
   }
}
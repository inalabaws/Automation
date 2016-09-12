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
		
		login.loginUI("praj@dhs.gov","inaflash");
		employee.createEmployee("demo", "nizampatnam", "demouser4@dhs.gov", "inaflash", "IT");
		login.loginValidation("demouser4@dhs.gov", "inaflash");
		login.loginUI("praj@dhs.gov","inaflash");
		employee.createEmployee("demo", "nizampatnam", "demouser4@dhs.gov", "inaflash", "IT");
	
		GiveKudos kudos= new GiveKudos();
		login.loginUI("demouser4@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee("a", "Teamwork","Good Work");
		login.loginUI("demouser4@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee("a", "Teamwork","Good Work");
   }
}
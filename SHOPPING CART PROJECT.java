import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String Smart_tv="25000";
		String shirts="650";
		String pants="800";
		String watch="500";
		String shoe="750";
		String socks="95";
		String tshirts="199";
		System.out.println("********ONLINE-SHOPPING-CART********");
		System.out.println("\tSmart tv ="+Smart_tv);
		System.out.println("\tShirts ="+shirts);
		System.out.println("\tPants ="+pants);
		System.out.println("\tWatch ="+watch);
		System.out.println("\tShoe ="+shoe);
		System.out.println("\tSocks ="+socks);
		System.out.println("\tT-shirts ="+tshirts);
		int sum=0;
		System.out.print("How Many Product You Need To Buy: ");
		int n=in.nextInt();
		
		System.out.print("ADD TO CART: ");
	for(int i=0;i<=n;i++){
	    System.out.print("enter the product: ");
		String product=in.next();	
		switch(product){
		    case "Smart_tv":
		        int Smart_tvv=25000;
		        System.out.print("enter the quantity: ");
		        int quality=in.nextInt();
		        sum+=quality*Smart_tvv;
		        break;
		   case "shirts":
		       int shirtss=650;
		       System.out.print("enter the quantity: ");
		        int qualityy=in.nextInt();
		        sum+=qualityy*shirtss;
		        break;
		         case "pants":
		       int pantss=800;
		       System.out.print("enter the quantity: ");
		        int qualityyy=in.nextInt();
		        sum+=qualityyy*pantss;
		        break;
		         case "watch":
		       int watchs=500;
		       System.out.print("enter the quantity: ");
		        int qualityyyy=in.nextInt();
		        sum+=qualityyyy*watchs;
		        break;
		        case "shoe":
		       int shoes=750;
		       System.out.print("enter the quantity: ");
		        int qualityyyyy=in.nextInt();
		        sum+=qualityyyyy*shoes;
		        break;
		        case "socks":
		       int sockss=95;
		       System.out.print("enter the quantity: ");
		        int sock1=in.nextInt();
		        sum+=sock1*sockss;
		        break;
		        case "tshirts":
		       int tshirtss=199;
		       System.out.print("enter the quantity: ");
		        int qualityyyyyy=in.nextInt();
		        sum+=qualityyyyyy*tshirtss;
		        break;
		        default:
		        System.out.println("product unavailable");
		        break;
		        
		       
		            
		}
		        
		}
        System.out.println("Your Bill Amount: "+sum);
		
	}
}
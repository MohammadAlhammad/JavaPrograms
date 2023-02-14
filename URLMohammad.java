package URLMohammad;  
import java.util.Scanner;
public class URLMohammad {                           

	public static void main(String[] args) {         

		        Scanner Mo = new Scanner (System.in);
		             System.out.println("Enter a URL please : ");
		        String url1 = Mo.next();                                                      
				")
		           System.out.println("Enter a URL please: ");System.out.println
		        String url2 = Mo.next();                                                     
		            System.out.println("Enter a URL please: ");
		        String url3 =  Mo.next();
                                              
				           for(i=0; i<=100; i++) {  [																																																																																						]
               System.out.println("---------------------------------"systaem. out.,printl
									
						   }I
		 String protocol1 = url1.substring(0, url1.indexOf(":"));
		     String domain1 = url1.substring(url1.indexOf(".") + 1, url1.lastIndexOf(".")); int 
			
					        String extension1 = url1.substring(url1.lastIndexOf(".") + 1, url1.length()  );     
		                                   
				                    System.out.printf("%5s | %15s | %5s\n", protocol1, domain1, extension1);

		 String protocol2 = url2.substring(0, url2.indexOf(":"));                                                             
		   String domain2 = url2.substring(url2.indexOf(".") + 1, url2.lastIndexOf(".")); 

		     String extension2 = url2.substring(url2.lastIndexOf(".") + 1, url2.length()  );
		                              
			                     System.out.printf("%5s | %15s | %5s\n", protocol2, domain2, extension2);

		 String protocol3 = url3.substring(0, url3.indexOf(":"));
		  String domain3 = url3.substring(url3.indexOf(".") + 1, url3.lastIndexOf("."))
		    String extension3 = url3.substring(url3.lastIndexOf(".") + 1, url3.length()  );
		            System.out.printf("%5s | %15s | %5s\n", protocol3, domain3, extension3);
						}
					
		        } 

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.IntStream;

/*
 * 
 * MissingInteger.java
 * 
 */
public class PersonalizedCoupons
{

    /*public static void main(String[] args)
    {
    		for(int i : solution(2, 5))
    		{
    			System.out.println("i : " + i);
    		}
        
        
    		int[] A2 = {3, 2, 3, 1, 3};     
        System.out.println("result : " + solution(A2, 5));
        
        int[] A3 = {-1, -3};     
        System.out.println("result : " + solution(A3));
        
        int[] A4 = {3};     
        System.out.println("result : " + solution(A4));
        
        int[] A5 = {2, 2, 2, 2, 2};
        System.out.println("result : " + solution(A5));
        
        int[] A6 = {};     
        System.out.println("result : " + solution(A6));
        
        System.out.println("result : " + solution(null, 4));
    }*/
    
    /*public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        List<String> preferredCategories = new ArrayList();
        preferredCategories.add("cat1");
        preferredCategories.add("cat2");
        preferredCategories.add("cat4");
        List<Map<String, Object>> coupons = new ArrayList<>();
        coupons.add(getCoupon1());
        coupons.add(getCoupon2());
        coupons.add(getCoupon3());
        coupons.add(getCoupon4());
        List<Map<String, Object>> personalizedCoupons = personalizeCoupons(coupons, preferredCategories);
        personalizedCoupons.stream().forEach(PersonalizedCoupons::printCoupon);
    }
    
    public static Map<String, Object> getCoupon1() {
        
        Map<String,Object> coupon = new HashMap<>();
        coupon.put("upc", "123");
        coupon.put("code", "123");
        coupon.put("category", "cat1");
        coupon.put("itemPrice", 100.0f);
        coupon.put("couponAmount", 25.0f);
        return coupon;
    }
    public static Map<String, Object> getCoupon2() {
        
        Map<String,Object> coupon = new HashMap<>();
        coupon.put("upc", "456");
        coupon.put("code", "456");
        coupon.put("category", "cat2");
        coupon.put("itemPrice", 100.0f);
        coupon.put("couponAmount", 15.0f);
        return coupon;
    }
    public static Map<String, Object> getCoupon3() {
        
        Map<String,Object> coupon = new HashMap<>();
        coupon.put("upc", "789");
        coupon.put("code", "789");
        coupon.put("category", "cat3");
        coupon.put("itemPrice", 40.0f);
        coupon.put("couponAmount", 20.0f);
        return coupon;
    }
    public static Map<String, Object> getCoupon4() {
        
        Map<String,Object> coupon = new HashMap<>();
        coupon.put("upc", "012");
        coupon.put("code", "012");
        coupon.put("category", "cat4");
        coupon.put("itemPrice", 100.0f);
        coupon.put("couponAmount", 20.0f);
        return coupon;
    }*/
	
	public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        List<String> preferredCategories = Arrays.asList(input.nextLine().split(","));
        List<Map<String, Object>> coupons = new ArrayList<>();
        int lines = Integer.parseInt(input.nextLine());
        IntStream.range(0, lines).forEach(i -> coupons.add(readCoupon(input)));
        List<Map<String, Object>> personalizedCoupons = personalizeCoupons(coupons, preferredCategories);
        personalizedCoupons.stream().forEach(PersonalizedCoupons::printCoupon);
    }

    public static Map<String, Object> readCoupon(Scanner input) {
        String[] couponItems = input.nextLine().split(",");
        Map<String,Object> coupon = new HashMap<>();
        coupon.put("upc", couponItems[0]);
        coupon.put("code", couponItems[1]);
        coupon.put("category", couponItems[2]);
        coupon.put("itemPrice", Float.parseFloat(couponItems[3]));
        coupon.put("couponAmount", Float.parseFloat(couponItems[4]));
        return coupon;
    }

    public static void printCoupon(Map<String, Object> coupon)
    {
        System.out.print("{");
        System.out.print("\"couponAmount\":" +  coupon.get("couponAmount") + ",");
        System.out.print("\"upc\":\"" +  coupon.get("upc") + "\",");
        if(coupon.containsKey("code")) {
            System.out.print("\"code\":\"" +  coupon.get("code") + "\",");
        }
        System.out.print("\"itemPrice\":" +  coupon.get("itemPrice") + ",");
        System.out.println("\"category\":\"" +  coupon.get("category") + "\"}");
    }
    
    static List<Map<String, Object>> personalizeCoupons(List<Map<String, Object>> coupons, 
            List<String> preferredCategories) 
    {
    		Map<Float, Map<String,Object>> filteredMap = new TreeMap<Float, Map<String, Object>>(Collections.reverseOrder());
    		for(Object obj : coupons)
    		{
    			@SuppressWarnings("unchecked")
				Map<String,Object> coupon = (Map<String, Object>) obj;
    			
    			if(preferredCategories.contains((String) coupon.get("category")))
                {
    					coupon.remove("code");
    				
                		float itemPrice = (float) coupon.get("itemPrice");
                    float couponAmount = (float) coupon.get("couponAmount");
                		
                		// calculate percentage here 
                		float percentage = couponAmount/itemPrice;
        	    			percentage = percentage * 100;
        	    			
        	    			
        	    			
        	    			filteredMap.put(percentage, coupon);
                }
    		}
    		
    		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
    		//List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
    		for (Object value : filteredMap.values()) 
    		{
    			if(result.size() < 10)
    			{
    				result.add((Map<String, Object>) value);
    			}
    			else
    			{
    				break;
    			}
    		}
    		
    		return result;
	}
}

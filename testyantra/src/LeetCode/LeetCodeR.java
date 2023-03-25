package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeR {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
	System.out.println("Enter the number of days");
	int size = sc.nextInt();
	int [] prices = new int [size];
	System.out.println("Enter the prices based on the day");
	for (int i = 0; i < prices.length; i++)
	{
	prices[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(prices));
	System.out.println("Profit is "+chechProfit(prices));
	}
	
	

	public static int chechProfit(int [] prices)
	{
	System.out.println("Enter the day you want to buy the stock");
	int dbuy = sc.nextInt();
	System.out.println("Enter the day you want to sell the stock");
	int dsell = sc.nextInt();
	
	int profit = 0;
	
	if(dbuy != 0 && dsell != 0)
	{
	for (int i = 0; i < prices.length; i++)
	{
	profit = prices[dsell - 1] - prices[dbuy - 1];
	}
	return profit;
	}
	else
	{
	return 0;
	}
	}
}

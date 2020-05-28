//  author Amr Rudy

//Algorithm class    Linear search
class Task4
{ 
    
  //Algorithm class    Linear search
// Function to return the maximum profit 
 
static int Beststock(int prices[]) 
{ 
   // Initialise the profit 
    int min = prices[0];
    int profit = 0;
    
    // No operations
    if (prices.length == 0) 
    {
        return 0; 
    }
    
  
    // to ckeck any operation is done in stock to calculate it 
     for(int i = 1; i < prices.length; i++)  
    {      
        // to check j = sell is >  i = buy 
            if(prices[i] > min)
            { 
                     profit = Math.max(profit, prices[i] - min);
           
            }
            else{
                min = prices[i];
            }
    }
     return profit; 
        
} 


// Driver code 
public static void main(String[] args) 
{ 
    // input array 
    int price[] = { 7 , 1, 5 , 3 , 6 , 4 }; 
    
    String input = "{";
    for(int i=0;i<price.length ;i++){
        input += price[i] + ",";
    }
    input += "}";
    
    System.out.println("Input : " + input);
  
    //calling algorithm function
    System.out.println("OutPut : " + Beststock(price)); 
    
} 
} 
  

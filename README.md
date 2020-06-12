Introduction
	In today’s financial world, prices have begun to fluctuate from everything as minute as cereal prices all the way up to major expenses such as rent. As college students rent is a big expense where price really matters. Rent prices are usually determined by the demographics around the area, the average income of the people in a specific area, property placement, etc.  In our data of US gross rent statistics different factors were taken into account. The attributes of our data consisted of state, zip code, residential type, square area of land and water at a location, and lastly longitude and latitude. With these attributes we have a used these attributes to see which of them affect whether rent prices are high or low. Based of looking at the data we hypothesize that the square area above water will have the greatest effect on the price of rent.

Objective 
Through data processing, scientific research and analysis, this group hopes to discover ways to show how certain regions will pay more on rent as compared to others solely based on location. We will take into account the number of samples being pulled from the location and how that may affect the rent compared to the areas around it. We hope to better determine whether we want to use supervised or unsupervised learning once we have a firmer grasp of the data. We will use python to visually display our findings in further depth. 

First-Method:
        	Originally for our first method our code was to implement the SVM Regression Method, however to implement that code another data set would need to be added. Instead for the first method the following questions were answered through our code:
 
1.      Is there a correlation between (a.) Aland and mean rent? (b.) Awater or mean rent?
2.      What is the average rent by type of residence?
3.      What are the top 10 and bottom 10 rent prices based on zip codes?
 
In the first problem we used a linear regression problem to see what type of affects the two attributes, awater and aland, would have against the mean of rent. After implementation, the results show that the two attributes are poorly correlated however they are still significant.
The method outputs the correlation values as well as the P-values for the correlations too:
Correlation Between Area Land and Mean Rent
[[ 1.         -0.03281923]
[-0.03281923  1.    	]]
 
Correlation Between Area Water and Mean Rent
[[ 1.         -0.01242022]
[-0.01242022  1.    	]]
 
Correlation coefficient and the p-value Between Area Land and Mean Rent
(-0.032819228837140411, 4.1083560437449803e-11)
 
Correlation coefficient and the p-value Between Area Water and Mean Rent
(-0.012420218796800941, 0.012518060105400471)
 
In the second problem the code takes the column Type and extracts the 5 residential types: CDP, Town, City, Village, and Borough to keep track of each individual types rent amount. The code also keeps a count of very entry so that when the mean is computed we know exactly how many entries to divide the total by. The results show that the residential type Track has the highest average rent with a price of $1006 and the residential type Town has the lowest average rent with a price of $709.

Idea:
We were tasked with gathering statistical information from the data.  The problems that were encountered include, deciding how to correctly format the information so that it reflects properly, removing invalid values, establishing which values would be used. Once we were able to format the data and remove unnecessary elements. The purpose was to determine the top and bottom 10 mean rent prices based upon zip-code. the dataset contains over 40k+ entries from various zip-codes across the entire united states. 


The initial hypothesis was that larger areas will have higher mean averages based solely on location. A general consensus is that California, New York, Florida, etc. will have higher rent prices. This assumption was somewhat of a foundation to compare and contrast as necessary. 	 
Figure 1.  Top 10 most expensive cities according to Time.com
With the top 10 highest cities given by Time.com, the next step was to remove the headers that would not show to be beneficial to the end goal of finding the top and bottom rent amounts as discussed before. 
 
 
Work:
      	The dataset consisted of 19 columns. While viewing the data, there were numerous categories that were in place that didn’t need to be there. This group narrowed the categories down to “Zip-code” and “Mean”. Once the necessary adjustments were made and saved, the data was loaded into Anaconda Spyder to determine the correct top and bottom 10 mean rent prices based on zip. Using python continued to be a learning experience as the project continued to progress on.  Upon the use of python, the data returned all the zip-codes have a mean of $0. As you can tell from Figure 1, that result was incorrect. The group then returned to excel and sorted the rent column in ascending order and all those with a value “0” were removed and the column was adjusted accordingly.
 
 
      	                                                                                                                                                                                     	
Figure 2a. Data before    			Figure 2. Data after “0” values removed
      	
With this adjustment made, the dataset was once again used in Spyder where the code properly displayed both the required results.

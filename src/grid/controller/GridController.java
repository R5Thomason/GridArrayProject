package grid.controller;

import grid.view.GridView;

public class GridController
{
	private int [][] numbers;
	private String [][] words;
	private GridView myView;
	
	public GridController()
	{
		numbers = new int [3][3];
		words = new String [4][4];
		myView = new GridView();
	}
	
	public void fillNumbers()
	{
		for(int row = 0; row < numbers.length; row++)
		{
			for(int col = 0; col < numbers[0].length; col++)
			{
				if((row + col) % 2 == 0)
				{
					numbers[row][col] = row+2;
				}
				else
				{
					numbers[row][col] = col+4;
				}
			}
		}
	}
	
	public void fillStrings()
	{
		for(int row = 0; row < words.length; row++)
		{
			for(int col = 0; col < words[0].length; col++)
			{
				if((row + col) % 2 == 0)
				{
					words[row][col] = "cat";
				}
				else if((row + col) % 3 == 0)
				{
					words[row][col] = "dog";
				}
				else if((row + col) == 1)
				{
					words[row][col]  = "thingy";
				}
				else
				{
					words[row][col] = "nothing";
				}
			}
		}
	}
	
	public void start()
	{
		fillNumbers();
		fillStrings();
		myView.printIntInformation(numbers);
		myView.printStringInformation(words);
	}
}

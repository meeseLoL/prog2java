class Program2
{
	int alwaysUsable = 45;

	public void start()
	{
		// here we are going to have the block for our cheese
		int cheese = 50; //var cheese = 50
		int cheese1 = 70; //var cheese1 = 70
		ct.rect(cheese, cheese, cheese1, 20);

		// here I am going to make the holes for the cheese
		double yPos = 50;
		double xPos = 70;
		String color = "black";

		ct.circle(xPos, yPos, 4, color);
		ct.circle(xPos/2, yPos, 4, color);
		ct.circle(xPos-10, yPos-3, 4, color);
		ct.circle(xPos-10, yPos+8, 4, color);
		ct.circle(alwaysUsable-17, yPos-3, 4, color);

		// Here I am going to use some expressions
		int sum = cheese + cheese1; // Expression: sum of cheese and cheese1
		ct.println("Sum: " + sum);

		double multiplied = xPos * yPos; // Expression: multiplication of xPos and yPos
		ct.println("Multiplied: " + multiplied);


		int squared = alwaysUsable * alwaysUsable; // Expression: square of alwaysUsable
		ct.println("Squared: " + squared);


	}

	public void update()
	{
		// cheese, cheese1, yPos, xPos, and color can not be used here
		// However, alwaysUsable can be used because it is used before the start block

	}
}

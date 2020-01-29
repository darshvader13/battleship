public static void deployPlayerShips() {
		//Check for valid location
		for(int i =1; i<=5; i++) 
		{
			System.out.print("Enter X coordinate for your #" + i + " ship: ");
			int x = input.nextInt();
			System.out.print("Enter Y coordinate for your #" + i + " ship: ");
			int y = input.nextInt();
			while(!((x>=0 && x<=9) && (y>=0 && y<=9))) 
			{
				System.out.println("Those coordinates are out of bounds! Please enter other coordinates... ");
				System.out.print("Enter X coordinate for your #" + i + " ship: ");
				x = input.nextInt();
				System.out.print("Enter Y coordinate for your #" + i + " ship: ");
				y = input.nextInt();
			}
			while(map[y][x] != 0) 
			{
				System.out.println("Those coordinates are out of bounds! Please enter other coordinates... ");
				System.out.print("Enter X coordinate for your #" + i + " ship: ");
				x = input.nextInt();
				System.out.print("Enter Y coordinate for your #" + i + " ship: ");
				y = input.nextInt();
			}
			map[y][x] = 1;
			System.out.println("Those coordinates are ok!");
		}
		
	}
	
public static void deployComputerShips() {
		System.out.println("Computer is deploying ships...");
		for(int i =1; i<=5; i++) 
		{
			int x = random.nextInt(10);
			int y = random.nextInt(10);
			while(!((x>=0 && x<=9) && (y>=0 && y<=9))) 
			{
				x = random.nextInt();
				y = random.nextInt();
			}
			while(map[y][x] != 0 && map[y][x] != 1) 
			{
				x = random.nextInt();
				y = random.nextInt();
			}
			map[y][x] = 2;
			System.out.println(i + ". ship DEPLOYED");
		}
		System.out.println("----------------------------------------");

	}

	public static void userTurn() 
	{
		//Player's Turn------------------------------------------------
		
		System.out.println("YOUR TURN");
		System.out.print("Enter X coordinate: ");
		int x = input.nextInt();
		System.out.print("Enter Y coordiante: ");
		int y = input.nextInt();
		
		//Check if guess is on board
		while(!((x>=0 && x<=9) && (y>=0 && y<=9))) 
		{
			System.out.println("Oops! That coordinate is out of bounds. Please enter another coordinate... ");
			System.out.print("Re-enter X coordinate: ");
			x = input.nextInt();
			System.out.print("Re-enter Y coordinate: ");
			y = input.nextInt();
		}
		
		//Check if guess has been repeated
		while(user_x_values.contains(x) && user_y_values.contains(y)) 
		{
			System.out.println("Oops! You already tried that guess. Please make another guess... ");
			System.out.print("Enter X coordinate: ");
			x = input.nextInt();
			System.out.print("Enter Y coordiante: ");
			y = input.nextInt();
		}
		user_x_values.add(x);
		user_y_values.add(y);
		
		//Valid Guess....
		if(map[y][x] == 2) {
			System.out.println("Yes! You sunk the ship!");
			computerShips -= 1;
			map[y][x] = 3; //print as "!" for hit 
		}
		else if(map[y][x] == 1) {
			 System.out.println("Oh no! you sunk your own ship!");
			 map[y][x] = 4; //print as "x" 	 
			 playerShips -= 1;
		}
		else 
		{
			System.out.println("Sorry, you missed");
			map[y][x] = 5; //print as "-"
		}
		
			
	}

	public static void computerTurn() 
	{
		//Computer's Turn
		
		System.out.println("COMPUTER'S TURN");
		int x = random.nextInt(10);
		int y = random.nextInt(10);
				
		//Check if guess is on board
		while(!((x>=0 && x<=9) && (y>=0 && y<=9))) 
		{
			x = random.nextInt(10);
			y = random.nextInt(10);
		}
				
		//Check if guess has been repeated
		while(computer_x_values.contains(x) && computer_y_values.contains(y)) 
		{
			x = random.nextInt(10);
			y = random.nextInt(10);
		}
		computer_x_values.add(x);
		computer_y_values.add(y);
				
		//Valid Guess....
		if(map[y][x] == 2) {
			System.out.println("The Computer sunk one of its own ships");
			computerShips -= 1;
			map[y][x] = 3; //print as "!" for hit 
		}
		else if(map[y][x] == 1) {
			 System.out.println("The Computer sunk one of your ships!");
			 playerShips -= 1;
			 map[y][x] = 4; //print as "x" 	 
		}
		else 
		{
		System.out.println("Computer missed");
			map[y][x] = 5;
		}

	}
}
	


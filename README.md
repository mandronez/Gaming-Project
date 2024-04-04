This is my first gaming project that I try to complete for a semester project. There are 2 versions of this game key board and audio.

The first code is the Audio version. This code is written in Processing and creates a simple game where a rectangle controlled by saying key words (left, right, up) to move across the screen. 
The goal is to avoid red rectangles moving down the screen. The game starts when the user presses the Enter key. The score increases as the player successfully avoids the red rectangles. 
If the player's rectangle collides with a red rectangle, the game ends, and the final score is displayed.

Here are the main components of the code:

It imports the websockets library.
Global variables are declared to track the position of objects, movement speed, score, and control states.
The setup() function initializes the WebSocket server and sets up the canvas size.
The draw() function handles the main game logic, including drawing objects, updating positions, checking for collisions, and displaying the score.
WebSocket messages are received in the webSocketServerEvent() function, which triggers actions based on the message content (e.g., moving the player's rectangle).
Key press and release events are handled in keyPressed() and keyReleased() functions, updating control states accordingly.

The second code is the keyboard version. This code is a simplified version of a game in Processing. Here's a breakdown of what it does:

It initializes variables for the player's position (x and y), movement speed (move), starting position of obstacles (placey, placex, placex2), and the player's score (score). 
It also defines boolean variables (left, right, up, start) to track key presses and game state.

In the setup() function, it sets the canvas to full screen.

The draw() function is the main game loop. It starts by drawing the background and displaying the score. 
It then draws a rectangle representing the player and two red rectangles representing obstacles.

The movement of the player is controlled by the arrow keys. If left is true, the player's x position is set to 50. If right is true, x is set to 1350. If up is true, x is set to 710.

The obstacles move down the screen (placey = placey + move) at a speed determined by the move variable. 
When an obstacle reaches the bottom of the screen, it resets to a random position above the screen, and the player's score increases.

If the player's rectangle collides with either of the red rectangles, the game ends (start is set to false), and the final score is displayed.

The keyPressed() function detects when keys are pressed and updates the corresponding boolean variables (left, right, up, start) accordingly. 
Pressing Enter starts the game and resets the score.

The keyReleased() function resets the corresponding boolean variables when keys are released.


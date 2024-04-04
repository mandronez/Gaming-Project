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

The second code is the keyboard version. 

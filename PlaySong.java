import java.util.Scanner;

import jaco.mp3.player.MP3Player;

public class PlaySong {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Song Start");
		MP3Player mp3 = new MP3Player(PlaySong.class.getResource("E.mp3"));
		mp3.play();
		System.out.println("Press enter key to stop the song");
		new Scanner(System.in).nextLine();
		//Thread.sleep(19000);

	}

}

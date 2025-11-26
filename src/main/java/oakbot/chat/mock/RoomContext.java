package oakbot.chat.mock;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.github.mangstadt.sochat4j.UserInfo;

/**
 * Provides context and services that a FileChatRoom needs from its parent client.
 * This interface breaks the cyclic dependency between FileChatClient and FileChatRoom.
 * @author Michael Angstadt
 */
public interface RoomContext {
	/**
	 * Gets the bot's user ID.
	 * @return the user ID
	 */
	Integer getUserId();

	/**
	 * Gets the bot's username.
	 * @return the username
	 */
	String getUsername();

	/**
	 * Gets the event ID counter for generating unique event IDs.
	 * @return the event ID counter
	 */
	AtomicLong getEventIdCounter();

	/**
	 * Gets the message ID counter for generating unique message IDs.
	 * @return the message ID counter
	 */
	AtomicLong getMessageIdCounter();

	/**
	 * Notifies the context that a room is being left.
	 * @param room the room being left
	 */
	void notifyRoomLeft(FileChatRoom room);

	/**
	 * Gets user information for the specified users in a room.
	 * @param roomId the room ID
	 * @param userIds the user IDs
	 * @return the user information
	 * @throws IOException if there's a problem getting the user info
	 */
	List<UserInfo> getUserInfo(int roomId, List<Integer> userIds) throws IOException;
}

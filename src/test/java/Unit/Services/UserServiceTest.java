package Unit.Services;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.boot.model.User;
import com.boot.service.UserService;

public class UserServiceTest {
	
	private UserService userService;
	private List<User> users;
	private int userId = 1;
	private User userMock = new User (2, "firstname", "lasname", "user@mail.com");
	
	@Before
	public void setup(){
		userService = Mockito.mock(UserService.class);
		Mockito.when(userService.saveOrUpdate(userMock)).thenReturn(getUserMock());
		Mockito.when(userService.getAll()).thenReturn(getUsersMock());
		Mockito.when(userService.get(userId)).thenReturn(userMock);
	}
	
	@Test
	public void userIsInserted(){		
		User user = userService.saveOrUpdate(userMock);
		
		assertThat(user.getId(), is(equalTo(getUserMock().getId())));
	}
	
	@Test
	public void usersAreReturned(){
		users = userService.getAll();
		
		assertThat(users.size(), is(equalTo(getUsersMock().size())));
	}
	
	@Test
	public void userIsReturned(){
		User user = userService.get(userId);
		
		assertThat(user, is(equalTo(userMock)));
	}
	
	private List<User> getUsersMock(){
		return Arrays.asList(new User(1, "firstname", "lasname", "user1@mail.com")
				, new User(2, "firstname2", "lastname2", "user2@mail.com"));
	}
	
	private User getUserMock(){
		return new User(userId, "firstname", "lastname", "user@mail.com");
	}
}

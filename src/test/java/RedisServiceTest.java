import com.alguojian.test.MyApplication;
import com.alguojian.test.service.UserBalanceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class RedisServiceTest {
    @Autowired
    private UserBalanceService userBalanceService;

    @Test
    public void testRedis() throws Exception {
        System.out.println(userBalanceService.get());
    }

    @Test
    public void getUserVerification() throws Exception {
        System.out.println(userBalanceService.getBookInfo());
    }

}

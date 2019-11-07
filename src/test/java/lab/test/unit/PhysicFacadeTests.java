package lab.test.unit;

import lab.application.PhysicFacade;
import lab.domain.PhysicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by nmpacko on 07/11/2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PhysicFacade.class,PhysicService.class})
public class PhysicFacadeTests {

    @Autowired
    private PhysicFacade subject;
    @MockBean
    private PhysicService mockService;

    @Test
    public void shouldReturnCorrectPos(){
        double a=0;
        double v0=0;
        double x0=0;
        double t=0;

        double actual=subject.getRectPos(a,v0,x0,t);

        double expected=0;
        assertThat(expected).isEqualTo(actual);
        verify(mockService).getRectPos(a,v0,x0,t);


    }

}

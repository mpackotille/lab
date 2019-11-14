package lab.application;

import lab.domain.PhysicService;
import org.springframework.stereotype.Component;

/**
 * Created by nmpacko on 07/11/2019.
 */
@Component
public class PhysicFacade {

    private final PhysicService physicService;

    public PhysicFacade(PhysicService physicService) {
        this.physicService = physicService;
    }

    public Double getRectPos(double t, double a, double v0, double x0){
    return this.physicService.getRectPos(t,a,v0,x0);
    }

    public Double getEc(double m, double v){
        return this.physicService.getEc(m,v);

    }
}

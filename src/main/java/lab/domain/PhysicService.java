package lab.domain;

import org.springframework.stereotype.Service;

/**
 * Created by nmpacko on 07/11/2019.
 */

@Service
public class PhysicService {

    public Double getRectPos(double t, double a, double v0, double x0){
        return (1/2)*a*t*t+v0*t+x0;
    }

    public Double getEc(double m, double v){
        return (1/2)*m*v*v;
    }
}

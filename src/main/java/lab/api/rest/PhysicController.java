package lab.api.rest;

import lab.application.PhysicFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nmpacko on 07/11/2019.
 */

@RestController
@RequestMapping("/api/v1")
public class PhysicController {

private final PhysicFacade physicFacade;

    public PhysicController(PhysicFacade physicFacade) {
        this.physicFacade = physicFacade;
    }

    @GetMapping("/rect/pos")
    public Double getRectPos(@RequestParam(defaultValue = "0") double t,
                             @RequestParam(defaultValue = "0") double a,
                             @RequestParam(defaultValue = "0") double v0,
                             @RequestParam(defaultValue = "0")  double x0){
        return this.physicFacade.getRectPos(t,a,v0,x0);
    }

    public Double getEc(@RequestParam(defaultValue = "0") double m,
                        @RequestParam(defaultValue = "0") double v){
        return this.physicFacade.getEc(m,v);

    }

}

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class Bean implements Serializable {
    public String getMessage() {
        return "Hello World from Hamburg";
    }
}

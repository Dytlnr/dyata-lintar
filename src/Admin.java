import java.util.ArrayList;
import java.util.List;

public class Admin {

    public boolean isAuthenticated(String username, String password) {
        return admins.stream().anyMatch(admin -> admin.username.equals(username) && admin.password.equals(password));
    }

    private List<AdminDetail> admins = new ArrayList<AdminDetail>();

    public void init() {
        AdminDetail adminPertama = new AdminDetail();
        adminPertama.password = "admin";
        adminPertama.username = "admin";
        AdminDetail adminKedua = new AdminDetail();
        adminKedua.password = "181204";
        adminKedua.username = "dytaa";
        admins.add(adminPertama);
        admins.add(adminKedua);
    }
}

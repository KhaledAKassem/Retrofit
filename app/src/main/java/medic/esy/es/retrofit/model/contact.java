package medic.esy.es.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class contact {

    @SerializedName("name")
    private String Name;
    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


}

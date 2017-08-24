package medic.esy.es.retrofit;

import java.util.List;

import medic.esy.es.retrofit.model.contact;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by khaled on 24/08/17.
 */

public interface ApiInterface {
     @POST("read.php")
     Call<List<contact>>getContacts();


}

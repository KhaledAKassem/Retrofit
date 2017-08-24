package medic.esy.es.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import medic.esy.es.retrofit.model.contact;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private  RecycleAdapter recycleAdapter;
    private List<contact>contacts ;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recycle);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<contact>> call=apiInterface.getContacts();
        call.enqueue(new Callback<List<contact>>() {
            @Override
            public void onResponse(Call<List<contact>> call, Response<List<contact>> response) {
                contacts=response.body();
                recycleAdapter=new RecycleAdapter(contacts);
                recyclerView.setAdapter(recycleAdapter);
            }

            @Override
            public void onFailure(Call<List<contact>> call, Throwable t) {

            }
        });

    }
}

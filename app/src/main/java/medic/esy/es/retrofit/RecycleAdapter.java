package medic.esy.es.retrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import medic.esy.es.retrofit.model.contact;

/**
 * Created by khaled on 24/08/17.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyviewHolder>{

 List<contact> contacts;
    public RecycleAdapter(List<contact>contacts){
        this.contacts=contacts;
    }
    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, int position) {

        holder.Name.setText(contacts.get(position).getName());
        holder.Email.setText(contacts.get(position).getEmail());

    }



    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{
        TextView Name,Email;
        public MyviewHolder(View itemView) {
            super(itemView);
            Name=(TextView) itemView.findViewById(R.id.name);
            Email=(TextView) itemView.findViewById(R.id.email);
        }
    }
}

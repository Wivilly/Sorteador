package br.edu.ifsp.dmo.sorteador.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import br.edu.ifsp.dmo.sorteador.R;

public class SorteioAdapter extends ArrayAdapter<Integer> {
    public SorteioAdapter(@NonNull Context context, @NonNull List<Integer> objects){
        super(context, R.layout.simple_list_item_1, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.simple_list_item_1,null);
        }

        String string = (position+1) + "º sorteado: " + getItem(position);
        ((TextView)convertView.findViewById(R.id.textView_history)).setText(string);

        return convertView;
    }
}

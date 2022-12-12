package com.example.dzen.main.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dzen.R;
import com.example.dzen.models.Feeling;

public class FeelingsAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Feeling[] arrayFeeling;

    public FeelingsAdapter(Feeling[] arrayFeeling) {
        this.arrayFeeling = arrayFeeling;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.feeling_item, viewGroup, false);

        return new ViewHolder(view);
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(arrayFeeling[position].name);
    }

    // Return the size of your array (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return arrayFeeling.length;
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public ViewHolder(View view) {
        super(view);
        textView = (TextView) view.findViewById(R.id.feel_text);
    }

    public TextView getTextView() {
        return textView;
    }
}




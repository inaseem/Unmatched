package ali.naseem.unmatched.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import ali.naseem.unmatched.R;
import ali.naseem.unmatched.models.Subject;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Subject> subjects;

    public SubjectsAdapter(Context context, ArrayList<Subject> subjects) {
        this.context = context;
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subject, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Subject subject=subjects.get(i);
        holder.name.setText(subject.getName());
        holder.percentage.setText(String.format(Locale.getDefault(),"%%%d",subject.getProgress()));
        holder.progressBar.setProgress(subject.getProgress());
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, percentage;
        public ProgressBar progressBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            percentage = itemView.findViewById(R.id.percentage);
            progressBar = itemView.findViewById(R.id.progressBar);
        }
    }
}

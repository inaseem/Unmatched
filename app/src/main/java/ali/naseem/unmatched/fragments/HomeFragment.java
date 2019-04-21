package ali.naseem.unmatched.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ali.naseem.unmatched.R;
import ali.naseem.unmatched.adapters.SubjectsAdapter;
import ali.naseem.unmatched.models.Subject;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView warning = view.findViewById(R.id.warning);
        warning.setText(Html.fromHtml("Your fre trail period has expired on <font color=\"#00bcd4\">29 Jan 2019</font> please upgrade now to get full access."));
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setNestedScrollingEnabled(false);
        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Mental Ability",0,"Some Path"));
        subjects.add(new Subject("Physics",100,"Some Path"));
        subjects.add(new Subject("Chemistry",90,"Some Path"));
        subjects.add(new Subject("Mathematics",50,"Some Path"));
        subjects.add(new Subject("Biology",10,"Some Path"));
        subjects.add(new Subject("English",19,"Some Path"));
        SubjectsAdapter subjectsAdapter = new SubjectsAdapter(getContext(), subjects);
        recyclerView.setAdapter(subjectsAdapter);
        return view;
    }

}

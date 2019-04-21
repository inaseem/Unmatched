package ali.naseem.unmatched.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ali.naseem.unmatched.R;
import ali.naseem.unmatched.adapters.SubjectsAdapter;

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
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        TextView warning=view.findViewById(R.id.warning);
        warning.setText(Html.fromHtml("Your fre trail period has expired on <font color=\"#448AFF\">29 Jan 2019</font> please upgrade now to get full access."));
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        SubjectsAdapter subjectsAdapter=new SubjectsAdapter();
        return view;
    }

}

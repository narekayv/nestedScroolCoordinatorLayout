package com.player.colapstoolbar.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.player.colapstoolbar.R;
import com.player.colapstoolbar.adapters.FirstRecyclerAdapter;


/**
 * Created by narek.ayvazyan on 04.07.2016.
 */

public class FirstFragment extends Fragment {



    public static FirstFragment newInstance() {
        
        Bundle args = new Bundle();
        
        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
           return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        RecyclerView recycler = (RecyclerView) view.findViewById(R.id.placesList);
        TextView cantLoad = (TextView) view.findViewById(R.id.cantLoad);



        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        recycler.setAdapter(new FirstRecyclerAdapter());
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_places, menu);
//        searchBtn = menu.getItem(1);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mapBtn) {

            return true;
        } else if (id == R.id.searchBtn) {

            return true;
        }


        return super.onOptionsItemSelected(item);
    }






}

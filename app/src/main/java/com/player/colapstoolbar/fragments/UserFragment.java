package com.player.colapstoolbar.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.player.colapstoolbar.R;
import com.player.colapstoolbar.adapters.UserProfileRecyclerAdapter;



/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {

    private UserProfileRecyclerAdapter userRecyclerAdapter;

    public static UserFragment newInstance() {

        Bundle args = new Bundle();

        UserFragment fragment = new UserFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        RecyclerView userGrid = (RecyclerView) view.findViewById(R.id.userGrid);
        userGrid.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        userGrid.setAdapter(new UserProfileRecyclerAdapter());

    }
}

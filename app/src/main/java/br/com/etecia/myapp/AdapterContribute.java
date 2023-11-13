package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterContribute extends FragmentStateAdapter {

    public AdapterContribute(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeContributeFragment();
            case 1:
                return new PeopleContributeFragment();
            case 2:
                return new ChatContributeFragment();
            default:
                return new HomeContributeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

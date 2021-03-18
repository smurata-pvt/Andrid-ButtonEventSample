package jp.smurata_pvt.sample.buttonevent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jp.smurata_pvt.sample.buttonevent.databinding.FragmentMainBinding;
import jp.smurata_pvt.sample.buttonevent.databinding.FragmentNextBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NextFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NextFragment extends Fragment implements View.OnClickListener {
    private FragmentNextBinding binding;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentNextBinding.inflate(getLayoutInflater());
        final View view = binding.getRoot();
        return view;
    }

    @Override
    public void onClick(View v) {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_nextFragment_to_mainFragment);
    }
}
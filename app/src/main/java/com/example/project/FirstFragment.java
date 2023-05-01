package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.project.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",2); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("number",3); // Put anything what you wa
                SecondFragment fragment2 = new SecondFragment();
                fragment2.setArguments(bundle);
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
            }

        }
        );
        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",4); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",5); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",6); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",7); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",8); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",9); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonEleven.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",11); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
        binding.buttonThirteen.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View view) {
                                                           Bundle bundle = new Bundle();
                                                           bundle.putInt("number",13); // Put anything what you wa
                                                           SecondFragment fragment2 = new SecondFragment();
                                                           fragment2.setArguments(bundle);
                                                           NavHostFragment.findNavController(FirstFragment.this)
                                                                   .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                       }

                                                   }
        );
        binding.buttonSeventeen.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Bundle bundle = new Bundle();
                                                       bundle.putInt("number",17); // Put anything what you wa
                                                       SecondFragment fragment2 = new SecondFragment();
                                                       fragment2.setArguments(bundle);
                                                       NavHostFragment.findNavController(FirstFragment.this)
                                                               .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
                                                   }

                                               }
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
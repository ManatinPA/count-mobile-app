package com.example.project;

import java.util.Locale;
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.project.databinding.FragmentSecondBinding;

import org.w3c.dom.Text;

import java.util.Random;

public class SecondFragment extends Fragment {
    int right_answer;
    int previous_right_answer=0;
    int score_count=0;
    private FragmentSecondBinding binding;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        BitmapDrawable pizza0 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza0);
        BitmapDrawable pizza1 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza1);
        BitmapDrawable pizza2 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza2);
        BitmapDrawable pizza3 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza3);
        BitmapDrawable pizza4 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza4);
        BitmapDrawable pizza5 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza5);
        BitmapDrawable pizza6 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza6);
        BitmapDrawable pizza7 = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza7);
        BitmapDrawable pizza_full = (BitmapDrawable) this.getResources().getDrawable(R.drawable.pizza_full);
        super.onViewCreated(view, savedInstanceState);
        ImageView score =(ImageView)view.findViewById(R.id.time);
        score.setImageDrawable(pizza0);
        savedInstanceState = this.getArguments();
        TextView second_argument=(TextView)view.findViewById(R.id.second_argument);
        int value=0;
        int bundle=savedInstanceState.getInt("number");
        TextView sign=(TextView)view.findViewById(R.id.sign);
        TextView val=(TextView) view.findViewById(R.id.value);
        if (savedInstanceState!=null) {
            while (true)
            {
                Random rand = new Random();
                int multiple_sign= rand.nextInt(2);
                String set_sign;
                if(multiple_sign==1)
                {
                    set_sign="*";
                }
                else
                {
                    set_sign=":";
                }
                sign.setText(set_sign);
                second_argument.setText(String.valueOf(bundle));
                rand = new Random();
                if (multiple_sign == 1) {
                    value = bundle * (2 + rand.nextInt(9));
                    right_answer = value / bundle;
                } else {
                    value = 2 + rand.nextInt(9);
                    right_answer = value * bundle;
                }
                if (value>100 || right_answer>100)
                    continue;
                val.setText(String.valueOf(value));
                if (right_answer!=previous_right_answer) {
                    previous_right_answer=right_answer;
                    break;
                }
            }
        }
        binding.guessNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText answer=(EditText) view.findViewById(R.id.guessNumber);
                if (answer.getText().toString().equals(String.valueOf(right_answer))) {
                    Toast.makeText(getActivity(), "RIGHT", Toast.LENGTH_SHORT).show();
                    score_count++;
                    second_argument.setText(String.valueOf(bundle));
                    while(true) {
                        Random rand = new Random();
                        int multiple_sign = rand.nextInt(2);
                        String set_sign;
                        if (multiple_sign == 1) {
                            set_sign = "*";
                        } else {
                            set_sign = ":";
                        }
                        sign.setText(set_sign);
                        int value = 0;
                        rand = new Random();
                        //value = bundle * (1 + rand.nextInt(10));
                        if (multiple_sign == 1) {
                            value = bundle * (2 + rand.nextInt(9));
                            right_answer = value / bundle;
                        } else {
                            value = 2 + rand.nextInt(9);
                            right_answer = value * bundle;
                        }
                        if (value>100 || right_answer>100)
                            continue;
                        val.setText(String.valueOf(value));
                        if (right_answer!=previous_right_answer) {
                            previous_right_answer=right_answer;
                            break;
                        }
                    }
                }
                    else {
                        Toast.makeText(getActivity(), "WRONG", Toast.LENGTH_SHORT).show();
                        if(score_count>0) score_count--;
                }
                if (score_count == 1) score.setImageDrawable(pizza1);
                else if (score_count == 2) score.setImageDrawable(pizza2);
                else if (score_count == 3) score.setImageDrawable(pizza3);
                else if (score_count == 4) score.setImageDrawable(pizza4);
                else if (score_count == 5) score.setImageDrawable(pizza5);
                else if (score_count == 6) score.setImageDrawable(pizza6);
                else if (score_count == 7) score.setImageDrawable(pizza7);
                else if (score_count >= 8) {
                    score.setImageDrawable(pizza_full);
                    Toast.makeText(getActivity(), "WELL DONE!", Toast.LENGTH_SHORT).show();
                    hideKeyboard(getActivity());
                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_FirstFragment);
                }
                else if (score_count <= 0) score.setImageDrawable(pizza0);
                answer.setText("");
            }

        });
    }
    public static void hideKeyboard(Activity activity) {
        InputMethodManager inputManager = (InputMethodManager) activity
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        // check if no view has focus:
        View currentFocusedView = activity.getCurrentFocus();
        if (currentFocusedView != null) {
            inputManager.hideSoftInputFromWindow(currentFocusedView.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
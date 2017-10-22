package net.respina.teslaa.ord.Control;

import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

/**
 * Created by teslaa on 10/22/17.
 */

public class AnimController {

    private static LottieAnimationView animationView;

    public void startAnim(String jsonAsset, View view, int idRes, boolean loop, float speed, final OnClickCallBack onClickCallBack){
        animationView = view.findViewById(idRes);
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(jsonAsset);
        animationView.playAnimation();
        animationView.loop(loop);
        animationView.setSpeed(speed);
        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickCallBack.onClickListener();
            }
        });
    }

    public void startAnim(String jsonAsset, View view, int idRes, boolean loop, float speed){
        animationView = view.findViewById(idRes);
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(jsonAsset);
        animationView.playAnimation();
        animationView.loop(loop);
        animationView.setSpeed(speed);
    }

    public void startAnim(String jsonAsset, View view, int idRes, boolean loop){
        animationView = view.findViewById(idRes);
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(jsonAsset);
        animationView.playAnimation();
        animationView.loop(loop);
        animationView.setSpeed(1f);
    }

    public void startAnim(String jsonAsset, View view, int idRes){
        animationView = view.findViewById(idRes);
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(jsonAsset);
        animationView.playAnimation();
        animationView.loop(true);
        animationView.setSpeed(1f);
    }

    public void setVisibility(int visibility){
        animationView.setVisibility(visibility);
    }

    public void clearColorFilter(){
        animationView.clearColorFilters();
    }

    public void setProgress(float progress){
        animationView.setProgress(progress);
    }

    public void stopAnim(){
        animationView.cancelAnimation();
    }

    public void reverseAnim(){
        animationView.reverseAnimation();
    }

    public void resumeAnim(){
        animationView.resumeAnimation();
    }

    public void resumeReverseAnim(){
        animationView.resumeReverseAnimation();
    }

    public boolean isAnimating(){
        return animationView.isAnimating();
    }

    public void setHardWareAcceleration(){
        animationView.useExperimentalHardwareAcceleration();
    }

    public void bringAnimToFront(){
        animationView.bringToFront();
    }

    public void onClickAnim(final OnClickCallBack onClickCallBack){
        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickCallBack.onClickListener();
            }
        });
    }
}

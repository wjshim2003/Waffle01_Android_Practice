package com.example.android.android_teamwork.ui


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    /*
    ViewModel 을 이용하도록 Fragment를 설계해주세요
    예를들어 ViewModel 을 이용해서 버튼을 누른만큼 그 횟수가 화면에 표시되는 기능이라던지...

    앞으로 개발하다보면 하나에 파일에서 여러명이 작업할 때도 있을 것 같은데, 어떤 위험이 있을까
    미리 점검하는 차원에서 이런 제약사항을 넣게 되었습니다.
     */
    var rotation = 0F
    var clicked = 0

    fun goRotate(): Float{
        rotation += 90
        clicked += 1
        return rotation
        }

    private val _count = MutableLiveData<Int>(0)
    val count: LiveData<String> = Transformations.map(_count) {
        _count.value.toString()
    }

    fun increaseCount() {
        _count.value = _count.value?.plus(1)
    }

    private val _clickCount = MutableLiveData<Int>(0)
    val clickCount: LiveData<Int> =_clickCount

    fun click() {
        _clickCount.value = _clickCount.value?.plus(1)

    }
}
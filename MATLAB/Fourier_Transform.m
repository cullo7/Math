%program that takes the fourier transform of a combinations of sine
%functins and plots the result

fs = 10;
t = [0:1/fs:25];%0-20, increment by 1/fs
y = sin(6*pi*t)+sin(4*pi*t);
plot(t,y);
title('f(t)=sin(6*pi*t)+sin(4*pi*t')
ylabel('Amplitude')
xlabel('Time')
pause(5);
f_trans = fft(y);%fourier transform of the function
num_elem = numel(y);%number of elements in array
f = [0:fs/num_elem:fs*(num_elem-1)/num_elem];%range
plot(f,abs(f_trans));%plot function
title('Fourier Tranformation')
ylabel('Amplitude')
xlabel('Time')
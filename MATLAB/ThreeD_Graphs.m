z = peaks(25);
figure
mesh(z)
pause(3)

surf(z)
colormap(jet)    % change color map
pause(3)

surfl(z)
colormap(pink)    % change color map
shading interp    % interpolate colors across lines and faces
pause(3)

contour(z,16)
colormap default    % change color map
pause(3)

x = -2:.2:2;
y = -1:.2:1;

[xx,yy] = meshgrid(x,y);
zz = xx.*exp(-xx.^2-yy.^2);
[px,py] = gradient(zz,.2,.2);

quiver(x,y,px,py)
xlim([-2.5 2.5])    % set limits of x axis
pause(3)

x = -2:.2:2;
y = -2:.25:2;
z = -2:.16:2;

[x,y,z] = meshgrid(x,y,z);
v = x.*exp(-x.^2-y.^2-z.^2);

xslice = [-1.2,.8,2];    % location of y-z planes
yslice = 2;              % location of x-z plane
zslice = [-2,0];         % location of x-y planes

slice(x,y,z,v,xslice,yslice,zslice)
xlabel('x')
ylabel('y')
zlabel('z')
pause(3)

L = 160*membrane(1,100);

f = figure;
ax = axes;
s = surface(L);
s.EdgeColor = 'none';
view(3)
pause(3)

ax.XLim = [1 201];
ax.YLim = [1 201];
ax.ZLim = [-53.4 160];
pause(3)

ax.CameraPosition = [-145.5 -229.7 283.6];
ax.CameraTarget = [77.4 60.2 63.9];
ax.CameraUpVector = [0 0 1];
ax.CameraViewAngle = 36.7;
pause(3)

ax.Position = [0 0 1 1];
ax.DataAspectRatio = [1 1 .9];
pause(3)

l1 = light;
l1.Position = [160 400 80];
l1.Style = 'local';
l1.Color = [0 0.8 0.8];
pause(3)

l2 = light;
l2.Position = [.5 -1 .4];
l2.Color = [0.8 0.8 0];
pause(3)

s.FaceColor = [0.9 0.2 0.2];
pause(3)

s.FaceLighting = 'gouraud';
s.AmbientStrength = 0.3;
s.DiffuseStrength = 0.6;
s.BackFaceLighting = 'lit';
pause(3)

s.SpecularStrength = 1;
s.SpecularColorReflectance = 1;
s.SpecularExponent = 7;
pause(3)

axis off
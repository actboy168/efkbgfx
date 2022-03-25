$output v_texcoord0
#include <bgfx_shader.sh>

void main()
{
    vec2 coord = vec2(
        float((gl_VertexID & 1) << 2),
        float((gl_VertexID & 2) << 1));

    v_texcoord0 = coord * 0.5;
    gl_Position = vec4(coord - 1.0, 0.0, 1.0);
}
/*
 Copyright @FabioZumbi12

 This class is provided 'as-is', without any express or implied warranty. In no event will the authors be held liable for any
  damages arising from the use of this class.

 Permission is granted to anyone to use this class for any purpose, including commercial plugins, and to alter it and
 redistribute it freely, subject to the following restrictions:
 1 - The origin of this class must not be misrepresented; you must not claim that you wrote the original software. If you
 use this class in other plugins, an acknowledgment in the plugin documentation would be appreciated but is not required.
 2 - Altered source versions must be plainly marked as such, and must not be misrepresented as being the original class.
 3 - This notice may not be removed or altered from any source distribution.

 Esta classe é fornecida "como está", sem qualquer garantia expressa ou implícita. Em nenhum caso os autores serão
 responsabilizados por quaisquer danos decorrentes do uso desta classe.

 É concedida permissão a qualquer pessoa para usar esta classe para qualquer finalidade, incluindo plugins pagos, e para
 alterá-lo e redistribuí-lo livremente, sujeito às seguintes restrições:
 1 - A origem desta classe não deve ser deturpada; você não deve afirmar que escreveu a classe original. Se você usar esta
  classe em um plugin, uma confirmação de autoria na documentação do plugin será apreciada, mas não é necessária.
 2 - Versões de origem alteradas devem ser claramente marcadas como tal e não devem ser deturpadas como sendo a
 classe original.
 3 - Este aviso não pode ser removido ou alterado de qualquer distribuição de origem.
 */

package br.net.fabiozumbi12.UltimateChat.Sponge.config;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.List;

@ConfigSerializable
public class TagsCategory {

    @Setting
    public String format;
    @Setting(value = "click-url")
    public String click_url;
    @Setting
    public String suggest;
    @Setting(value = "click-cmd")
    public String click_cmd;
    @Setting(value = "hover-messages")
    public List<String> hover_messages;
    @Setting
    public String permission;
    @Setting(value = "show-in-worlds")
    public List<String> show_in_worlds;
    @Setting(value = "hide-in-worlds")
    public List<String> hide_in_worlds;

    public TagsCategory() {
    }

    /**
     * @param format
     * @param click_cmd
     * @param hover_messages
     * @param permission
     * @param show_in_worlds
     * @param hide_in_worlds
     */
    public TagsCategory(String format, String click_cmd, List<String> hover_messages, String permission, List<String> show_in_worlds, List<String> hide_in_worlds, String click_url) {
        this.format = format;
        this.click_cmd = click_cmd;
        this.hover_messages = hover_messages;
        this.permission = permission;
        this.show_in_worlds = show_in_worlds;
        this.hide_in_worlds = hide_in_worlds;
        this.click_url = click_url;
    }
}